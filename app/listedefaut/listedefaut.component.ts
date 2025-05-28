import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { saveAs } from 'file-saver';

import { NgForm } from '@angular/forms';
import * as XLSX from 'xlsx';

@Component({
  selector: 'app-listedefaut',
  templateUrl: './listedefaut.component.html',
  styleUrls: ['./listedefaut.component.scss']
})
export class ListedefautComponent implements OnInit {
  data: any[] = [];

  constructor(private http: HttpClient) {}

  ngOnInit(): void {
    this.fetchData();
  }

  fetchData(): void {
    this.http.get<any[]>('http://localhost:8095/api/v1/defaut/defauts').subscribe((response) => {
      this.data = response;
    });
  }

  downloadExcel(): void {
    // Créer un objet de classe Excel Workbook et ajouter les données
    const workbook = XLSX.utils.book_new();
    const worksheet = XLSX.utils.json_to_sheet(this.data);
    XLSX.utils.book_append_sheet(workbook, worksheet, 'Feuille1');

    // Convertir le classe Excel Workbook en un objet blob
    const excelBlob = XLSX.write(workbook, { bookType: 'xlsx', type: 'array' });

    // Enregistrer le fichier Excel en tant que fichier blob
    const filename = 'Liste_Defauts.xlsx';
    const blob = new Blob([excelBlob], { type: 'application/vnd.ms-excel' });
    saveAs(blob, filename);
  }

 
 

}