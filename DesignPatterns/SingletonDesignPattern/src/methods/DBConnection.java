package methods;

public class DBConnection {

    private volatile static DBConnection conObject;
    int memberVariable;

    private DBConnection(int memberVariable){
        this.memberVariable = memberVariable;
    }

    public static DBConnection getInstance(){
        if (conObject==null){
            synchronized (DBConnection.class){
                if (conObject==null){
                    conObject = new DBConnection(10);
                }
            }
        }
        return conObject;
    }
}
