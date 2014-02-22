/**
 * Created by Idans on 22/02/14.
 */
public class RedBlackNode {
    // Constructors
    RedBlackNode( Comparable theElement ) {
        this( theElement, null, null );
    }

    RedBlackNode( Comparable theElement, RedBlackNode lt, RedBlackNode rt ) {
        element  = theElement;
        left     = lt;
        right    = rt;
        color    = Consts.BLACK;
    }

    Comparable   element;    // The data in the node
    RedBlackNode left;       // Left child
    RedBlackNode right;      // Right child
    int          color;      // Color
}