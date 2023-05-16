package unal.todosalau.ecopowerhub;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Date;

public class MainActivity extends AppCompatActivity {
    private TextView transaccionTextView;
    private Button realizarTransaccionButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        transaccionTextView = findViewById(R.id.transaccionTextView);
        realizarTransaccionButton = findViewById(R.id.realizarTransaccionButton);

        // Crear instancias de TerrazaJardin
        TerrazaJardin terraza1 = new TerrazaJardin();
        terraza1.setCapacidadGeneracion(100.0);
        terraza1.setUbicacion("Terraza 1");
        terraza1.setDescripcion("Terraza con paneles solares");

        TerrazaJardin terraza2 = new TerrazaJardin();
        terraza2.setCapacidadGeneracion(150.0);
        terraza2.setUbicacion("Terraza 2");
        terraza2.setDescripcion("Terraza con turbinas eólicas");

        // Crear instancias de Usuario
        Usuario usuario1 = new Usuario();
        usuario1.setNombre("Usuario 1");
        usuario1.setDireccion("Dirección 1");
        usuario1.setContacto("Contacto 1");
        usuario1.setTerrazaJardin(terraza1);

        Usuario usuario2 = new Usuario();
        usuario2.setNombre("Usuario 2");
        usuario2.setDireccion("Dirección 2");
        usuario2.setContacto("Contacto 2");
        usuario2.setTerrazaJardin(terraza2);

        // Realizar una transacción al presionar el botón
        realizarTransaccionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Realizar la transacción
                Transaccion transaccion = new Transaccion();
                transaccion.setVendedor(usuario1);
                transaccion.setComprador(usuario2);
                transaccion.setCantidadEnergia(50.0);
                transaccion.setFechaTransaccion(new Date());

                // Actualizar el TextView con los datos de la transacción
                String transaccionText = "Transacción realizada:\n" +
                        "Vendedor: " + transaccion.getVendedor().getNombre() + "\n" +
                        "Comprador: " + transaccion.getComprador().getNombre() + "\n" +
                        "Cantidad de energía: " + transaccion.getCantidadEnergia() + "\n" +
                        "Fecha de transacción: " + transaccion.getFechaTransaccion();

                transaccionTextView.setText(transaccionText);
            }
        });
    }
}