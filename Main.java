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
    
    
    int r = 0;
    int i = 1;

    while ( r <= 10 ){  
        
        while ( i <= 3 ){
            System.out.println( i );
            i++;
          }

      i = 1;
      r++;

    }
  }
}