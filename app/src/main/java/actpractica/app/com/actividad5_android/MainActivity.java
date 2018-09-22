package actpractica.app.com.actividad5_android;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Persona> personaList = new ArrayList<>();
    private RecyclerView recyclerPersonas;
    private PersonaAdapter personaAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        recyclerPersonas = (RecyclerView) findViewById(R.id.rd_persona);

        personaAdapter = new PersonaAdapter(personaList);
        RecyclerView.LayoutManager uLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerPersonas.setLayoutManager(uLayoutManager);
        recyclerPersonas.setItemAnimator(new DefaultItemAnimator());
        recyclerPersonas.setAdapter(personaAdapter);

        dataPersona();

    }

    private void dataPersona() {
        Persona persona= new Persona("Yesica Lizbeth", "Aldape García", 19);
        personaList.add(persona);
        persona = new Persona("Emily Elizabeth", "Ann Cox", 20);
        personaList.add(persona);
        persona = new Persona("Evelyn", "Treviño Piña", 19);
        personaList.add(persona);
        persona = new Persona("Kimberly", "Arevalo Oroso", 22);
        personaList.add(persona);
        persona = new Persona("Marco André", "Benavides", 19);
        personaList.add(persona);
        persona = new Persona("Ana Karen", "Aldape García", 14);
        personaList.add(persona);
        persona = new Persona("Allie Michell", "Flores Sánchez", 19);
        personaList.add(persona);

        personaAdapter.notifyDataSetChanged();
    }
}