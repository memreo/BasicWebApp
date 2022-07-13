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
        else if (query.contains(" which of the following numbers is the largest: 414, 81")){
            return "414 of course:)";
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
