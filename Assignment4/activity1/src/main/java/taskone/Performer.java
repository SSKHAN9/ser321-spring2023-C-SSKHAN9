/**
  File: Performer.java
  Author: Student in Fall 2020B
  Description: Performer class in package taskone.
*/

package taskone;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONObject;

/**
 * Class: Performer 
 * Description: Threaded Performer for server tasks.
 */
class Performer {

    private StringList state;
    private Socket conn;

    public Performer(Socket sock, StringList strings) {
        this.conn = sock;
        this.state = strings;
    }

    public JSONObject add(String str) {
        JSONObject json = new JSONObject();
        json.put("ok", true);
        json.put("type", "add");
        state.add(str);
        json.put("data", state.toString());
        return json;
    }

    public JSONObject clear(){
        JSONObject json = new JSONObject();
        json.put("ok", true);
        json.put("type", "clear");
        state.clear();
        json.put("data", state.toString());
        return json;
    }

    public JSONObject find(String str){
        JSONObject json = new JSONObject();
        json.put("ok", true);
        json.put("type", "find");
        json.put("data", state.find(str));
        return json;
    }

    public JSONObject display(){
        JSONObject json = new JSONObject();
        json.put("ok", true);
        json.put("type", "display");
        json.put("data", this.state.toString());
        return json;
    }

    public JSONObject delete(int index){
        JSONObject json = new JSONObject();
        json.put("ok", true);
        json.put("type", "delete");
        state.delete(index);
        json.put("data", state.toString());
        return json;
    }

    public JSONObject prepend(int index, String sb){
        JSONObject json = new JSONObject();
        json.put("ok", true);
        json.put("type", "prepend");
        json.put("data", state.prepend(index, sb));
        return json;
    }

    public JSONObject quit(){
        JSONObject json = new JSONObject();
        json.put("ok", true);
        json.put("type", "quit");
        json.put("data", "Bye!");
        return json;
    }

    public static JSONObject error(String err) {
        JSONObject json = new JSONObject();
        json.put("ok", false);
        json.put("message", err);
        return json;
    }

    public void doPerform() {
        boolean quit = false;
        OutputStream out = null;
        InputStream in = null;
        try {
            out = conn.getOutputStream();
            in = conn.getInputStream();
            System.out.println("Server connected to client:");
            while (!quit) {
                byte[] messageBytes = NetworkUtils.receive(in);
                JSONObject message = JsonUtils.fromByteArray(messageBytes);
                JSONObject returnMessage = new JSONObject();
   
                int choice = message.getInt("selected");
                    switch (choice) {
                        case (0):
                            returnMessage = quit();
                            quit = true;
                            break;
                        case (1):
                            String inStr1 = (String) message.get("data");
                            returnMessage = add(inStr1);
                            break;
                        case (2):
                            returnMessage = clear();
                            break;
                        case (3):
                            String str = (String) message.get("data");
                            returnMessage = find(str);
                            break;
                        case (4):
                            returnMessage = display();
                            break;
                        case (5):
                            int idx = message.getInt("data");
                            returnMessage = delete(idx);
                            break;
                        case (6):
                            String inStr2 = (String) message.get("data");
                            int index = Integer.parseInt(inStr2.substring(0, 1));
                            String sb = inStr2.substring(2,inStr2.length());
                            prepend(index, sb);
                            returnMessage = display();
                            break;
                        default:
                            returnMessage = error("Invalid selection: " + choice 
                                    + " is not an option");
                            break;
                    }
                // we are converting the JSON object we have to a byte[]
                byte[] output = JsonUtils.toByteArray(returnMessage);
                NetworkUtils.send(out, output);
            }
            // close the resource
            System.out.println("close the resources of client ");
            out.close();
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        } 
    }
}
