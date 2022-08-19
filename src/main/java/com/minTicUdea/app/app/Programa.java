package com.minTicUdea.app.app;

import com.minTicUdea.model.Client;
import com.minTicUdea.model.Order;
import com.minTicUdea.model.OrderItem;
import com.minTicUdea.model.Product;
import com.minTicUdea.model.enums.OrderStatus;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite datos del cliente: ");
        System.out.println("Nombre: ");
        String nombre = sc.nextLine();
        System.out.println("email: ");
        String email = sc.nextLine();
        System.out.println("Fecha de nacimiento (YYYY-MM-DD)"); //ISODate
        String fechaNacimiento = sc.nextLine();
        LocalDate fechaDate = LocalDate.parse(fechaNacimiento);

        /*se crea un objeto de la clase cliente y se ponen los datos que recibirá como parametros en la clase
        cliente*/
        Client cliente = new Client (nombre, email, fechaDate);

        System.out.println("Introduzca los datos del pedido: ");
        System.out.println("Estado: ");
        OrderStatus status = OrderStatus.valueOf(sc.next());

        Order oder = new Order(LocalDate.now(), cliente, new ArrayList<>(), status);

        System.out.println("¿Cúantos artículos tiene este pedido?: ");
        int numeroArticulos = sc.nextInt();

        for(int i = 1; i<=numeroArticulos; i++){
            System.out.println(("Introduzca el número " + " datos del articulo: "));
            System.out.println("Nombre del producto: ");
            sc.nextLine();
            String nombreProducto = sc.nextLine();
            System.out.println("Precio del producto: ");
            double precioProducto = sc.nextDouble();
            System.out.println("Cantidad: ");
            int cantidad = sc.nextInt();

            Product producto = new Product(nombreProducto, precioProducto);

            OrderItem orderItem = new OrderItem(cantidad, precioProducto, producto);

            oder.addItem(orderItem);
        }

        System.out.println("Resumen del pedido: ");
        System.out.println(oder);
        sc.close();

    }
}
