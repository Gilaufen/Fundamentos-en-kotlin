package com.gilaufen.tienda2687391

import android.annotation.SuppressLint
import android.content.ContentValues
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

//hacer validaciones de tarea, o sea de campos vacios y esas mondá, controlar los mensajes y eso
//hacer una lista de productos, tipo un mapeo y cosas así

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonRegistrar = findViewById<Button>(R.id.buttonRegistrarP);
        val buttonConsultar = findViewById<Button>(R.id.buttonConsultarP);
        val buttonEliminar = findViewById<Button>(R.id.buttonEliminarP);
        val buttonEditar = findViewById<Button>(R.id.buttonEditarP);
        val buttonVerProductos = findViewById<Button>(R.id.VerProductos);

        val codigo = findViewById<EditText>(R.id.editTextNumberCodigo);
        val nombre = findViewById<EditText>(R.id.editTextNombreP);
        val precio = findViewById<EditText>(R.id.editTextNumberPrecio);

        buttonRegistrar.setOnClickListener{

            //yo no tengo que mandar el cursor porque ya viene con la libreria por eso mandamos nulo
            //con la version le decimos cual de todas las versiones queremos modificar, por ahora solo la primera
            val adminDB = AdminSQL(this, "TiendaEucas", null, 1 );

            //permite usar y manipular la tabla que creamos por allá en la base de datos
            val db = adminDB.writableDatabase;

            //le decimos que registro tiene varios valores con ese contenedor
            val registro = ContentValues()
            registro.put("codigo", codigo.text.toString().toInt())
            registro.put("nombre", nombre.text.toString())
            registro.put("precio", precio.text.toString().toFloat())
            val consulta = db.rawQuery("SELECT codigo FROM producto WHERE codigo = ${codigo.text.toString()}", null)

            if(consulta === null){
                db.insert("producto",null, registro);
                db.close()
                codigo.setText("");
                nombre.setText("");
                precio.setText("");
                Toast.makeText(this,"Producto Registrado", Toast.LENGTH_LONG).show()
            }else{
                Toast.makeText(this,"Ese código de producto ya existe", Toast.LENGTH_LONG).show();
                codigo.setText("");
                db.close()
            }
        }
        buttonConsultar.setOnClickListener {

            //aquí comprueba si la base de datos existe, teniendo en cuenta la version, si no pues la crea y si si pues la deja muy suaves
            val adminDB = AdminSQL(this, "TiendaEucas", null, 1 );
            val db = adminDB.writableDatabase;

            //normal consultar sql para poder acceder a la base de datos
            val consulta = db.rawQuery("SELECT nombre, precio FROM producto WHERE codigo = ${codigo.text.toString()}", null)

            //recorre desed el primero, o sea uno por uno para poder encontrarlo
            if(consulta.moveToFirst()) {
                //index de las columnas consultadas, por ejemplo la 0 es nombre :0
                nombre.setText(consulta.getString(0));
                precio.setText(consulta.getString(1));
            }else{
                //si no encuentra nada :p
                Toast.makeText(this,"Producto no encontrado", Toast.LENGTH_LONG).show();
                nombre.setText("");
                precio.setText("");
            }
            db.close()
        }

        buttonEditar.setOnClickListener {
            val adminDB = AdminSQL(this, "TiendaEucas", null, 1 );
            val db = adminDB.writableDatabase;
            val registro = ContentValues()
            registro.put("nombre", nombre.text.toString())
            registro.put("precio", precio.text.toString().toFloat())
            val act = db.update("producto", registro, "codigo = ${codigo.text.toString()}", null)
            db.close()
            if (act == 1){
                Toast.makeText(this,"Producto Actualizado", Toast.LENGTH_LONG).show();
            }else{
                Toast.makeText(this,"Producto no existe", Toast.LENGTH_LONG).show();
            }
        }

        buttonEliminar.setOnClickListener {
            val adminDB = AdminSQL(this, "TiendaEucas", null, 1 );
            val db = adminDB.writableDatabase;
            val eliminar = db.delete("producto", "codigo = ${codigo.text.toString()}", null)
            codigo.setText("");
            nombre.setText("");
            precio.setText("");
            if(eliminar ==1){
                Toast.makeText(this,"Producto Eliminado", Toast.LENGTH_LONG).show();
            }else{
                Toast.makeText(this,"Producto no encontrado", Toast.LENGTH_LONG).show();
            }
        }

        buttonVerProductos.setOnClickListener{
            val intento1 = Intent(this,ListProducts::class.java)
            startActivity(intento1)
        }


    }


}