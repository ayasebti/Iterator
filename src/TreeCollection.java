public class TreeCollection implements Collection{
    private int valeur;
    private TreeCollection gauche, droit, pere;
    public TreeCollection treeNum;
    
     // CONSTRUCTEURS
     public TreeCollection(){
        TreeCollection b = new TreeCollection(2,new TreeCollection(1),new TreeCollection(4,new TreeCollection(3),new TreeCollection(5)));
        TreeCollection cc = new TreeCollection(10,new TreeCollection(8),new TreeCollection(12));       
        treeNum = new TreeCollection(6,b,cc);
    }
    
    public TreeCollection(int x) {
        valeur = x;
        pere=null;
        gauche = null;
        droit = null;
        
    }

    public TreeCollection(int x, TreeCollection g, TreeCollection d) {
        valeur = x;
        gauche = g;
        droit = d;
        g.pere=this;
        d.pere=this;
        
    }

    @Override
    public Iterator getIterator() {
        // TODO Auto-generated method stub
        
        return new TreeIterator();
    }
    
    public class TreeIterator implements Iterator{
        public TreeCollection g=null,
                d=null, r;
        // Quatre constantes pour désigner les différentes visites d'un noeud
            final int prefix = 0; // Première visite  (Préfixe)
            final int infix  = 1; // Deuxième visite  (Infixe)
            final int suffix = 2; // Troisième visite (Suffixe)
            final int fini   = 3; // Parcours terminé
            int st=prefix;             // État : prefix, infix, suffix, ou fini
            
        @Override
        public boolean hasNext() {
            // TODO Auto-generated method stub
            while(st != fini && st != prefix)
                getMore();
            return st == prefix;
            
        }
        
        @Override
        public Object getMore() {
            // TODO Auto-generated method stub
            r = treeNum;             // Valeur de retour
            switch (st) {
                case prefix:            // Première visite du noeud
                    if (treeNum.gauche != null)    // Si le fils gauche existe,
                        treeNum = treeNum.gauche;       // le noeud suivant est le fils gauche.
                    else 
                        st = infix;         // Sinon, on passe à la deuxième visite.
                    break;
                    
                case infix:             // Deuxième visite du noeud
                    if (treeNum.droit != null) {  // Si le fils droit existe,
                        treeNum = treeNum.droit;       // le noeud suivant est le fils droit
                        st = prefix;    // et c'est la première visite de ce noeud.
                    } else 
                        st = suffix;    // Sinon, on passe à la troisième visite.
                    break;
                    
                case suffix:            // Troisième visite du noeud
                    if (treeNum.pere != null) {   // Si le père existe
                        if (treeNum == treeNum.pere.gauche) {  // et si le noeud est son fils gauche 
                            st = infix; // et c'est la deuxième visite du père
                        } else {        // Sinon
                            st = suffix;// et c'est la troisième visite du père.
                        }
                        treeNum = treeNum.pere;        // le noeud suivant est le père
                    } else 
                        st = fini;      // Sinon, c'est terminé.
                }
            return r.valeur;
        }

    }

}