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
        Persona persona= new Persona("Allie", "Flores", 19);
        personaList.add(persona);
        persona = new Persona("Anahí", "Flores", 20);
        personaList.add(persona);
        persona = new Persona("Gloria", "Sánchez", 45);
        personaList.add(persona);
        persona = new Persona("Homero", "Flores", 42);
        personaList.add(persona);
        persona = new Persona("Carlos", "Fernandez", 26);
        personaList.add(persona);
        persona = new Persona("Pablo", "Marmol", 21);
        personaList.add(persona);
        persona = new Persona("Pedro", "Marmol", 22);
        personaList.add(persona);

        personaAdapter.notifyDataSetChanged();
    }
}