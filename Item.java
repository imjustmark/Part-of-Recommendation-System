import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//one-hot -> pasar a bits (interseccion y union en java mas facil)

public class Item {
    int ID;
    ArrayList<String> tags;

    /**
     * Default builder
     */
    public Item() {
        ID = 0;
        tags = new ArrayList<>();
    }
    /**
     * Default builder including the item id.
     * @param id , id which item is identified
     */
    public Item(int id) {
        ID = id;
        tags = new ArrayList<>();
    }

    /**
     * Getter of the item id
     */
    public Integer getID() {
        return this.ID;
    }

    /**
     * Get the tag of the list in a determinate position
     * @param i , position of the tag in the List
     */
    public List<String> getTags(int i) {
        return Collections.singletonList(this.tags.get(i));
    }

    /**
     * Get the number of tags that an item has.
     */
    public Integer getNumTags() {
        return tags.size();
    }

    /*
    /**
     * Add a tag to the set of tags
     * @param tag1 , element to insert to the set
     */
    /* public void addTag(String tag1) {
        int n = tags.length;
        String[] new_tags = new String[n+1];
         int i;
        for (i = 0; i < n; i++) new_tags[i] = tags[i];
        new_tags[n] = tag1;
        tags = new_tags;
     }

    public Boolean exsistTag (String tag, List<String>){

    }

    public void delTag(String tag1) {
        //...
    }
     */
    public void setID(int id) {
        this.ID = id;
    }

}