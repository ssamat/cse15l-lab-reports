import java.io.IOException;
import java.net.URI;
import java.util.ArrayList;

class Handler implements URLHandler {
    // The one bit of state on the server: a number that will be manipulated by
    // various requests.
    ArrayList<String> totalWords = new ArrayList<String>();
    ArrayList<String> foundWords = new ArrayList<String>();
    String addedWordtoList = "";
    String subString = "";
    public String handleRequest(URI url) {
        System.out.println("Path: " + url.getPath());
        if (url.getPath().equals("/")) {
            return String.format("Welcome to the Search Engine");
        }
        if (url.getPath().contains("/add")) {
            String[] parameters = url.getQuery().split("=");
            addedWordtoList = parameters[1];
            totalWords.add(addedWordtoList);
            return String.format("List: %s", addedWordtoList);
        }
        else if (url.getPath().contains("/search")) {
            String[] parameters = url.getQuery().split("=");
            subString = parameters[1];
            for (int i = 0; i < totalWords.size(); i++){
                if(totalWords.get(i).contains(subString)){
                    foundWords.add(totalWords.get(i));
                    return String.format("The substring %s is in %s", subString, totalWords.get(i));
                }
            }
                   
        }
         return "404 Not Found!";
    }

}


class SearchEngine {
    public static void main(String[] args) throws IOException {
        if(args.length == 0){
            System.out.println("Missing port number! Try any number between 1024 to 49151");
            return;
        }

        int port = Integer.parseInt(args[0]);

        Server.start(port, new Handler());
    }
}
