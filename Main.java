class Main {
  public static void main(String[] args) {
    //문제 100부터 25까지의 합 출력

    /*
    int i = 100;
    int sum = 0;
    while ( i >= 25 ){
      sum += i;
      i--;
    } 
    System.out.println( sum );

    */

    // 문제 : 1부터 3까지 출력하는 작업을 10번 해주세요.
    // 조건 : 2중 while문 사용
    
    /*
    int r = 1;
    int i = 1;

    while ( r <= 10 ){  
          System.out.printf( "i : %d\n", r);
        while ( i <= 3 ){
            System.out.println( i );
            i++;
          }

      i = 1;
      r++;

    }
    */
    
    //for 문 구구단 8단

  /*
    for ( int i = 1 ; i <= 9 ; i++){

      int j = 8;
      System.out.println( j + " x " + i + " = " + j * i);
      
    }
  */

  /*
    //for 문 (2중) 구구단 2~9단 (컴퓨터는 위에서 아래로 읽으니 조심!)

  for (int x = 1 ; x <= 9 ; x++){ 

    System.out.printf("%d 단: \n", x);

    for ( int i = 1 ; i <= 9 ; i++){

      //System.out.println( x + " x " + i + " = " + x * i); 
      System.out.printf("%d * %d = %d\n", x, i, x*i);
    }
  }
  */  

  /*
  // arry 연습
  int [] arr;
  arr = new int[3];
  arr[0] = 10;
  arr[1] = 20;
  arr[2] = 30;

  int sum = arr[0] + arr[1] + arr[2];
  System.out.printf("sum : %d\n", sum);
  System.out.printf("arr.length : %d\n", arr.length);
*/


  int [] arr;
  arr = new int[5];
  arr[0] = 1;
  arr[1] = 2;
  arr[2] = 3;
  arr[3] = 4;
  arr[4] = 5;

  int sum = arr[0] + arr[1] + arr[2] + arr[3] + arr[4];

  System.out.printf("sum : %d\n", sum);
 
  }
}