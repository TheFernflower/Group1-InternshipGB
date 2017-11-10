package windowGUI.options.workSQL;

import retrofit2.Response;

import java.io.IOException;
import java.util.ArrayList;

public class KeyWordsTable extends ConnectServer{
/*
<РЕАЛ>
Часть кода которая будет использоваться с реальными данными из базы
*/
    private RestApiForKeyWordsTable restApiForKeyWordsTable = getRetrofit().create(RestApiForKeyWordsTable.class);

    private ArrayList<Integer> getListIDReal() {
        try {
            Response<ArrayList<Integer>> response = restApiForKeyWordsTable.getListIDFromKeyWordsTable().execute();
            return response.body();
        } catch (IOException | AssertionError e) {
            e.printStackTrace();
            return  new ArrayList<Integer>();
        }
    }

    private ArrayList<String> getListNameReal(){
        try {
            Response<ArrayList<String>> response = restApiForKeyWordsTable.getListNameFromKeyWordsTable().execute();
            return response.body();
        } catch (IOException | AssertionError e) {
            e.printStackTrace();
            return  new ArrayList<String>();
        }
    }

    public ArrayList<Integer> getListPersonIDReal(){
        try {
            Response<ArrayList<Integer>> response = restApiForKeyWordsTable.getListPersonIDFromKeyWordsTable().execute();
            return response.body();
        } catch (IOException e) {
            e.printStackTrace();
            return  new ArrayList<Integer>();
        }
    }
/*
</РЕАЛ>
*/

/*
<ФЕЙК>
Часть кода для проверки работоспособности обработки данных из БД
*/
    private static final ArrayList<Integer> listID = new ArrayList<>();
    private static final ArrayList<String> listName = new ArrayList<>();
    private static final ArrayList<Integer> listPersonID = new ArrayList<>();

    public ArrayList<Integer> getListID(){
        for (int i = 1; i <= 9; i++) {
            listID.add(i);
        }
        return listID;
    }

    public ArrayList<String> getListName(){
        listName.add("Путин");
        listName.add("Путинa");
        listName.add("Путинy");
        listName.add("Путиным");
        listName.add("Навальный");
        listName.add("Навальным");
        listName.add("Навальному");
        listName.add("Навального");
        listName.add("Собчак");
        return listName;
    }

    public ArrayList<Integer> getListPersonID(){
        listPersonID.add(1);
        listPersonID.add(1);
        listPersonID.add(1);
        listPersonID.add(1);
        listPersonID.add(2);
        listPersonID.add(2);
        listPersonID.add(2);
        listPersonID.add(2);
        listPersonID.add(3);
        return listPersonID;
    }
/*
</ФЕЙК>
*/
}
