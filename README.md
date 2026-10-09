# QuestTugasLayout_0028

Tugas layout Jetpack Compose yang menampilkan daftar kartu profil mahasiswa
Teknologi Informasi, Universitas Muhammadiyah Yogyakarta.

## Identitas

- Nama : Ahmad Nawfal Ramadhan
- NIM  : 20240140028
- Kelas: C

## Fitur

- Judul program studi dan nama universitas di bagian atas
- 4 kartu profil dengan warna berbeda (abu-abu, ungu, biru, hijau)
- Logo universitas di sisi kiri dan kanan setiap kartu
- Nama bergaya Cursive pada kartu pertama
- Nomor telepon bersifat opsional (kartu pertama tidak menampilkannya)
- Footer Copyright di bagian bawah layar

## Ketentuan yang Dipenuhi

| Ketentuan | Implementasi |
|---|---|
| Warna, gambar, teks di Resources | `colors.xml`, `strings.xml`, `drawable/` |
| Ukuran (dp/sp) tidak hardcode | `dimens.xml` |
| Card dalam 1 fungsi terpisah | `KartuProfil()` di `Act3.kt` |
| Layout Jetpack Compose | `Column`, `Row`, `Card`, `Box` |

## Struktur File

```
app/src/main/
├── java/com/example/pertemuan4/
│   ├── MainActivity.kt
│   └── Act3.kt
└── res/
    ├── drawable/logo_umy.png
    └── values/
        ├── colors.xml
        ├── dimens.xml
        └── strings.xml
```

## Cara Menjalankan

1. Clone repository ini:
```
   git clone https://github.com/[username]/QuestTugasLayout_4NIMBelakang.git
```
2. Buka folder project di Android Studio.
3. Tunggu proses Gradle Sync selesai.
4. Pilih emulator atau perangkat fisik, lalu klik **Run**.

## Teknologi

- Kotlin
- Jetpack Compose
- Android Studio


## Tampilan

<img width="253" height="552" alt="Screenshot 2026-10-09 185125" src="https://github.com/user-attachments/assets/6af3427c-1a71-4f3c-9dcf-2c59d687cb53" />

  
