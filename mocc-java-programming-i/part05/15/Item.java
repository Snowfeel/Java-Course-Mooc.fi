public class Item {
    private String name;
    private String id;

    public Item (String name,String id){
        this.name = name;
        this.id = id;
    }

    public String toString(){
        return (id + ": " + name);
    }

    public boolean equals(Object compared){
        if (this == compared){
            return true;
        }

        if (!(compared instanceof Item)){
            return false;
        }

        Item comparedItem = (Item)compared;

        if (this.id.equals(comparedItem.id)){
            return true;
        }

        return false;
    }
}