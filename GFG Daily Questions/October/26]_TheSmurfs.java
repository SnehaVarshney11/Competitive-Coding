package October;

class TheSmurfs {
    static int minFind(int n, String a[]){

        int r = 0, b = 0, g = 0;

        boolean isSame = true;

        for(int i = 1;i < n;i++){

            if(!a[i-1].equals(a[i])){

                isSame = false;

                break;

            }

        }

        for(int i = 0;i < a.length;i++){

            if(a[i].equals("R")) r++;

            else if(a[i].equals("B")) b++;

            else if(a[i].equals("G")) g++;

        }

        if(isSame) return n;

        else if(r%2 == 0  && b%2 == 0 && g%2 == 0) return 2;

        else if(r%2 != 0  && b%2 != 0 && g%2 != 0) return 2;

        else return 1;

    }
}
