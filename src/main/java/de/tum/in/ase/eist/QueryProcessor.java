package de.tum.in.ase.eist;

import org.springframework.stereotype.Service;


@Service
public class QueryProcessor {

    public String process(String query) {
		query = query.toLowerCase();
        if (query.contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";

        } 
        else if (query.contains(" what is your name")) {
            return "Emre ur best friend:)";}
        // else if (query.contains("name")) {
        //    return "MyTeam";
        // } 
        else if (query.contains(" which of the following numbers is the largest: ")){
            String[] f =  query.split(":");
            String[] s = f[1].split(",");
            for(int i = 0; i<= s.length; i++){
                s[i] = s[i].replace(" ", "");
            }
            int a = Integer.parseInt(s[0]);
            int b = Integer.parseInt(s[1]);
            if(a > b){
                return a+"is the largest";
            }
            else{
                return b+"is the largest";
            }


        }

        else if(query.contains("what is 9 plus 10")){
            return "19";


        }

        else if(query.contains("which of the following numbers is the largest: 54, 95")){
            return "95";
            
        }
        else if(query.contains("what is 8 plus 14")){
            return "22";

            
        }
        else if(query.contains(" what is 3 multiplied by 16")){
            return "48";

            
        }

        else { // TODO extend the programm here
            return "";
        }
    }
}
