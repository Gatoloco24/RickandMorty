package cl.inacap.myapplication.adapters;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.squareup.picasso.Picasso;

import java.util.List;

import cl.inacap.myapplication.R;
import cl.inacap.myapplication.dto.Personaje;

public class PersonajesListAdapter extends ArrayAdapter<Personaje> {
    private List<Personaje> personajes;
    private Activity contexto;
    public PersonajesListAdapter(@NonNull Context context, int resource, @NonNull List objects) {
        super(context, resource, objects);
        this.personajes = objects;
        this.contexto = (Activity) context;

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = this.contexto.getLayoutInflater();
        View rowView = inflater.inflate(R.layout.list_personajes, null,true);
        TextView nombreTxt = rowView.findViewById(R.id.nombre_personajes);
        ImageView imagePer = rowView.findViewById(R.id.imagen_personajes);
        nombreTxt.setText(this.personajes.get(position).getName());
        Picasso.get().load(this.personajes.get(position).getImage())
                .resize(300,300)
                .centerCrop()
                .into(imagePer);
        return rowView;
    }
}
