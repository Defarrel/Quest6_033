package com.example.tugas_pertemuan8.ui.view.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
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
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Text(text = "Detail Data Mahasiswa", modifier = Modifier.padding(bottom = 16.dp))
        ListDataMhs.forEach { data ->
            Detailmhs(
                judul = data.first,
                isinya = data.second
            )
        }

        Text(text = "Detail Rencana Studi", modifier = Modifier.padding(vertical = 16.dp))
        ListDataKRS.forEach { data ->
            Detailmhs(
                judul = data.first,
                isinya = data.second
            )
        }

        Button(
            onClick = { onBackButton() },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(text = "Kembali")
        }
    }
}