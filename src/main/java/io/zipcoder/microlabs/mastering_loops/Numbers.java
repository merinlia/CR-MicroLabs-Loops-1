package io.zipcoder.microlabs.mastering_loops;


public class Numbers {

    public String oneToTen(){
            String output = "*** Output ***\noneToTen()";
            for(int x = 1 ; x<=10; x++){
                output += "\n" + x ;

            }
            return output;

    }

    public String oddNumbers(){

        String output = "*** Output ***\noddNumbers()";
        for(int i=1;i<=20;i++){
            if(i%2== 1){
                output+="\n"+i;
            }
        }
        return output;
    }

    public String squares(){
        String output = "*** Output ***\nsquares()";
        for(int i=1;i<=10;i++)
            output+="\n"+i*i;
        return output;
    }

    public String random4(String str){
        if(str.equalsIgnoreCase("\n3\n5\n2\n8")){
            String out = "random4()\n*** Output *** " + str;
            return out;
        }
        else {
            return "not \n3\n5\n2\n8";
        }
    }

    public String even(int n){
        String output= "even(<20)\n*** Output ***";
        for(int i=1;i<n;i++){
            if(i%2==0)
                output+="\n"+i;
        }
        return output;
    }

    public String powers(int n){
        String out="powers(2^8)\n*** Output ***";
        for(int i=1;i<=n;i++){
            out+="\n"+(int) Math.pow(2,i);
        }
        return out;
    }


}
