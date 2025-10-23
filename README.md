# TestCase2_IconPlus
Test Case Number 2 for PLN Icon Plus Recruitment

# 🧩 Employee Management REST API

## 📖 Deskripsi Proyek
**Test Case 2 ini** adalah proyek backend berbasis **Spring Boot (Java)** .  
Aplikasi ini berfungsi sebagai **REST API** untuk melakukan manajemen data karyawan (*Employee*) dan departemen (*Department*), mencakup operasi **CRUD** dan beberapa fitur tambahan berbasis query data.

Proyek ini menekankan pada penerapan konsep **OOP (Object-Oriented Programming)**, **layered architecture**, dan **RESTful API design** menggunakan **Spring Boot + Spring Data JPA**.

---

## ⚙️ Teknologi yang Digunakan
- **Java 17**
- **Spring Boot 3.x**
- **Spring Data JPA (Hibernate)**
- **Spring Web (REST Controller)**
- **Maven**
- **MySQL**
- **Lombok**

---

## 🧱 Struktur Database

### Tabel `departments`
| Kolom | Tipe Data | Keterangan |
|--------|------------|------------|
| id | BIGINT (PK) | ID Departemen |
| name | VARCHAR | Nama departemen |

### Tabel `employees`
| Kolom | Tipe Data | Keterangan |
|--------|------------|------------|
| id | BIGINT (PK) | ID Karyawan |
| name | VARCHAR | Nama karyawan |
| department_id | BIGINT (FK) | Relasi ke tabel departments |
| salary | DECIMAL | Gaji karyawan |

---

## 🚀 Fitur Utama

### 🔹 Employee Endpoint
| Method | Endpoint | Deskripsi |
|--------|-----------|-----------|
| `POST` | `/employees` | Menambahkan karyawan baru |
| `GET` | `/employees` | Menampilkan seluruh data karyawan |
| `GET` | `/employees/{id}` | Menampilkan detail karyawan berdasarkan ID |
| `PUT` | `/employees/{id}` | Memperbarui data karyawan berdasarkan ID |
| `DELETE` | `/employees/{id}` | Menghapus karyawan berdasarkan ID |


### 🔹 Department Endpoint
| Method | Endpoint | Deskripsi |
|--------|-----------|-----------|
| `POST` | `/departments` | Menambahkan departemen baru |
| `GET` | `/departments` | Menampilkan seluruh data departemen |
| `GET` | `/departments/{id}` | Menampilkan detail departemen berdasarkan ID |
| `PUT` | `/departments/{id}` | Memperbarui data departemen berdasarkan ID |
| `DELETE` | `/departments/{id}` | Menghapus departemen berdasarkan ID |


🧩 **Contoh Request JSON (POST /employees):**
```json
{
  "name": "Zacky Faishal",
  "department": { "id": 1 },
  "salary": 9000000
}

