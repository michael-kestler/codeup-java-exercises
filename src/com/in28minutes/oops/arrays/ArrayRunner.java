package com.in28minutes.oops.arrays;
import java.util.* ;

public class ArrayRunner {
            public static void main ( String[] args)
        {
            ArrayList<String> names = new ArrayList();

            names.add( "Amy" );    names.add( "Bob" );
            names.add( "Chris" );  names.add( "Deb" );
            names.add( "Elaine" ); names.add( "Frank" );
            names.add( "Gail" );   names.add( "Hal" );

            for ( String nm : names )
                System.out.println( nm );
        }
    }






