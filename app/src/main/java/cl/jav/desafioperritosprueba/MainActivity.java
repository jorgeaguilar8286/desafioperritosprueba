package cl.jav.desafioperritosprueba;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;
import cl.jav.desafioperritosprueba.presenter.PresenterList;
import cl.jav.desafioperritosprueba.presenterview.IPresenterViewList;
import cl.jav.desafioperritosprueba.view.DogAdapter;

public class MainActivity extends AppCompatActivity implements IPresenterViewList {
    private DogAdapter adapter;
    private PresenterList presenter;
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        presenter = new PresenterList(this);
        adapter = new DogAdapter(new ArrayList<>());
        recyclerView = findViewById(R.id.recycleview);
        recyclerView.setLayoutManager(new LinearLayoutManager(getParent()));
        recyclerView.setAdapter(adapter);
    }


    @Override
    public void notificar(List<String> list) {
        adapter.updateBreeds(list);
    }
}
