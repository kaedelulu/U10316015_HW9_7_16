/**
	ID:U10316015
	No:7.16
	Information:Write a method to sort two-dimensional array
*/
public class SortArray {
		//Main method
		public static void main( String[] args ) {
		int m[][] = { { 4 , 2 } , { 1 , 7 } , { 4 , 5 } , { 1 , 2 } , { 1 , 1 } , { 4 , 1 } };
		System.out.println( "Before>>\n{ { 4 , 2 } , { 1 , 7 } , { 4 , 5 } , { 1 , 2 } , { 1 , 1 } , { 4 , 1 } }" );
		sort( m );
		printArray( m );
	}
	
	public static void sort( int m[][] ) {
		for( int i = 0 ; i < m.length ; i++ ) {
			double currentMin = m[ i ][ 0 ];
			int currentMinIndex = i;
		
			for( int j = i ; j < m.length ; j++ ) {
			if( currentMin > m[ j ][ 0 ] || ( currentMin == m[ j ][ 0 ] && m[ currentMinIndex ][ 1 ] > m[ j ][ 1 ] ) )
				{
					currentMin = m[ j ][ 0 ];
					currentMinIndex = j;
				}
			}
		
			// Swap list[i] with list[currentMinIndex] if necessary;
			if( currentMinIndex != i ) {
				int temp0 = m[ currentMinIndex ][ 0 ];
				int temp1 = m[ currentMinIndex ][ 1 ];
				m[ currentMinIndex ][ 0 ] = m[ i ][ 0 ];
				m[ currentMinIndex ][ 1 ] = m[ i ][ 1 ];
				m[ i ][ 0 ] = temp0;
				m[ i ][ 1 ] = temp1;
			}
		}
	}
	
	//print out the result
	public static void printArray( int m[][] ) {
		System.out.print( "After>>\n{ " );
		for( int i = 0; i < m.length - 1; i++ ) {
			System.out.print( "{ " + m[ i ][ 0 ] + " , " + m[ i ][ 1 ] + " } , " );
		}
		System.out.print( "{ " + m[ m.length -1 ][ 0 ] + " , " + m[ m.length -1 ][ 1 ] + " }" );
		System.out.print( " }" );
	}
	
}
