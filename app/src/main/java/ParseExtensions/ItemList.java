package ParseExtensions;


import com.parse.ParseClassName;
import com.parse.ParseObject;

@ParseClassName("List")
public class ItemList extends ParseObject {

    public ItemList(String description){
        put("Description",description);
    }

    public String getDescription(){
        return getString("Description");
    }

    public void setDescription(String newDescription){
        put("Description",newDescription);
        saveInBackground();
    }
}
