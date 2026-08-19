public class Ch1201 {


    public static void hellow_ratangular(int r, int c){
        for (int i=1; i<=r; i++){
            for(int j=1; j<=c; j++){
                if(i==1 || i==r || j==1 || j==c){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }


        public static void rotated_halfparimid(int n){
            for(int i=1; i<=n; i++){
                for(int j=n-i; j>0; j--){
                    System.out.print(" ");
                }
                for(int k=n-i; k<n; k++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }


        public static void rotated_halfparimid2(int n){
            for(int i=1; i<=n; i++){
                for(int j=1; j<=n-i; j++){
                    System.out.print(" ");
                }
                for(int k=1; k<=i; k++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }

        public static void inverted_halfparimid_num(int n){
            for(int i=1; i<=n; i++){
                for(int j=1; j<=n-i+1; j++){
                    System.out.print(j);
                }
                System.out.println();
            }
        }

        public static void floyad_triangle(int n){
            int num = 1;
            for(int i=1; i<=n; i++){
                for(int j=1; j<=i; j++){
                    System.out.print(num++ + " ");
                }
                System.out.println();
            }
        }

        public static void zero_one_triangle(int n){
           
            for(int i=1; i<=n; i++){
                for(int j=1; j<=i; j++){
                   if((i+j)%2==0){
                    System.out.print("1");
                   }else{
                    System.out.print("0");
                   }
                }
                System.out.println();
            }
        }


        public static void butterfly(int n){
            for(int i=1; i<=n; i++){
                for(int j=1; j<=i; j++){
                    System.out.print("*");
                }
                    for(int k=1; k<=n-i; k++){
                        System.out.print(" ");
                 } 

                for(int j=1; j<=n-i; j++){
                    System.out.print(" ");
                }
                for(int j=1; j<=i; j++){
                    System.out.print("*");
                }System.out.println();
            }

            for(int i=1; i<=n; i++){
                for(int j=1; j<=n-i; j++){
                    System.out.print("*");
                }
                    for(int k=1; k<=i; k++){
                        System.out.print(" ");
                 } 

                for(int j=1; j<=i; j++){
                    System.out.print(" ");
                }
                for(int j=1; j<=n-i; j++){
                    System.out.print("*");
                }System.out.println();
            }

        }


        public static void butterfly2(int n){
            for(int i=1; i<=n; i++){
                //star
                for(int j=1; j<=i; j++){
                    System.out.print("*");
                }
                //spaces
                for(int j=1; j<=2*(n-i); j++){
                    System.out.print(" ");
                }
                //stars
                for(int j=1; j<=i; j++){
                    System.out.print("*");
                }
                System.out.println();
            }

            for(int i=n; i>=1; i--){
                //star
                for(int j=1; j<=i; j++){
                    System.out.print("*");
                }
                //spaces
                for(int j=1; j<=2*(n-i); j++){
                    System.out.print(" ");
                }
                //stars
                for(int j=1; j<=i; j++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }

            public static void solid_rhombus(int n){
                for(int i=1; i<=n; i++){
                    for(int j=1; j<=n-i; j++){
                        System.out.print(" ");
                    }
                    for(int j=1; j<=n; j++){
                        System.out.print("*");
                    }System.out.println();
                }
            }

            public static void hollow_rohombus(int n){
        for (int i=1; i<=n; i++){
             for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=n; j++){
                if(i==1 || i==n || j==1 || j==n){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
                
     }


     public static void daimond(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=(i*2)-1; j++){
                System.out.print("*");
            }System.out.println();
        }
        for(int i=n; i>=1; i--){
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=(i*2)-1; j++){
                System.out.print("*");
            }System.out.println();
        }
     }


     public static void number_pyramid(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
     }


     public static void palindromicNum(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int j=i; j>=1; j--){
                System.out.print(j);
            }
            for(int j=2; j<=i; j++){
                System.out.print(j);
            }System.out.println();
        }

     }
        
    public static void main(String[] args) {
    //    hellow_ratangular(5, 10);
    //     inverted_halfparimid_num(5);
    //    floyad_triangle(4);
    //    zero_one_triangle(5);
    //    butterfly2(5);
    //   solid_rhombus(4);
    //   hollow_rohombus(5);
    //   daimond(4);
   // number_pyramid(5);
   palindromicNum(5);
    }    
}
