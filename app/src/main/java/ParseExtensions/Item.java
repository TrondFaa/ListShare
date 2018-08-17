package ParseExtensions;

import com.parse.ParseClassName;
import com.parse.ParseObject;

@ParseClassName("Item")
public class Item extends ParseObject{

    public Item(String title){
        put("Title",title);
        saveInBackground();
    }

    public String getTitle(){
        return getString("Title");
    }


}
