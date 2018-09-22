package actpractica.app.com.actividad5_android;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class PersonaAdapter extends RecyclerView.Adapter<PersonaAdapter.MyViewHolder>{
    public ArrayList<Persona> personaList;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView nombre, apellido, edad;
        private MyViewHolder(View view) {
            super(view);
            nombre = (TextView) view.findViewById(R.id.txt_nombre);
            apellido = (TextView) view.findViewById(R.id.txt_apellido);
            edad = (TextView) view.findViewById(R.id.txt_edad);
        }
    }
    public PersonaAdapter (ArrayList<Persona> personaList){
        this.personaList = personaList;
    }
    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_item_personas, parent, false);
        return new MyViewHolder(itemView);
    }
    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Persona persona = personaList.get(position);
        holder.nombre.setText(persona.getNombre());
        holder.apellido.setText(persona.getApellido());
        holder.edad.setText(String.valueOf(persona.getEdad())+"Edad");
    }
    @Override
    public int getItemCount(){
        return personaList.size();
    }

}
