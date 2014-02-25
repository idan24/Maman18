/**
 * Created by Idans on 22/02/14.
 */
public class Main {
    public static void main( String [ ] args ) {
        final int MAX_BOOKS_NUM = 10;

        ListNode[] booksDivision = new ListNode[MAX_BOOKS_NUM + 1];
        RedBlackTree t = new RedBlackTree( );

        System.out.println( "Checking... (no more output means success)" );

        /*for( int i = GAP; i != 0; i = ( i + GAP ) % NUMS )
            t.insert( new Integer( i ) );

        if( ((Integer)(t.findMin( ))).intValue( ) != 1 ||
                ((Integer)(t.findMax( ))).intValue( ) != NUMS - 1 )
            System.out.println( "FindMin or FindMax error!" );

        for( int i = 1; i < NUMS; i++ )
            if( ((Integer)(t.find( new Integer( i ) ))).intValue( ) != i )
                System.out.println( "Find error1!" );*/
    }
}
