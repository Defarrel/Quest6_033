package com.example.tugas_pertemuan8.ui.view.screen

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.tugas_pertemuan8.model.Mahasiswa
import com.example.tugas_pertemuan8.model.RencanaStudi

@Composable
fun DetailView(
    dataMhs: Mahasiswa,
    dataKRS: RencanaStudi,
    modifier: Modifier = Modifier,
    onBackButton: () -> Unit
) {
    val ListDataMhs = listOf(
        Pair("NIM", dataMhs.nim),
        Pair("Nama", dataMhs.nama),
        Pair("Email", dataMhs.email)
    )

    val ListDataKRS = listOf(
        Pair("Mata Kuliah", dataKRS.namaMK),
        Pair("Kelas", dataKRS.kelas)
    )
}