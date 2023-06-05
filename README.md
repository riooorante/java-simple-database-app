# Database
Di dalam package ini terdapat satu database yang digunakan dalam aplikasi ini. Database tersebut hanya memuat satu table yaitu "main_table"

# App
Di dalam package ini terdapat satu file Main.java. Class Main ini akan menjadi tempat untuk menjalankan main method yang memanggil semua method lainnya yang terdapat dalam package com.

# com
1. config

    Package ini berisi class Connect yang memuat method connection. Method ini akan menghubungkan aplikasi dengan database.

2. controllers

    Package ini berisi beberapa class seperti Creat, Delete, Read, dan Update. Fungsi dari setiap class sesuai dengan nama dari masing-masing class.

3. layout

    Package ini berisi beberapa class layout yang mengatur interaksi user dengan aplikasi. Setiap class pada controllers memiliki layout di package ini. Dalam package yang sama, terdapat mainlayout yang akan mengatur semua layout aplikasi.

4. model 

    Package ini berisi class DataSiswa. Tugas dari class ini adalah mengeset dan mengembalikan nama, nim, dan program studi.
