import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { saveAs } from 'file-saver';
import * as XLSX from 'xlsx';

@Component({
  selector: 'app-listedefautadmin',
  templateUrl: './listedefautadmin.component.html',
  styleUrls: ['./listedefautadmin.component.scss']
})
export class ListedefautadminComponent implements OnInit  {
  
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
  
    downloadExcel() {
      // Create a new Excel Workbook object and add data
      const workbook = XLSX.utils.book_new();
      const worksheet = XLSX.utils.json_to_sheet(this.data);
      XLSX.utils.book_append_sheet(workbook, worksheet, 'Feuille1');
  
      // Convert the Excel Workbook class to a blob object
      const excelBlob = XLSX.write(workbook, { bookType: 'xlsx', type: 'array' });
  
      // Save the Excel file as a blob file
      const filename = 'Liste_Defauts.xlsx';
      const blob = new Blob([excelBlob], { type: 'application/vnd.ms-excel' });
      saveAs(blob, filename);
    }
    
    private apiUrl = 'http://localhost:8095/api/v1/defaut';
  
    deleteDefaut() {
      if (!this.id) {
        console.error("ID is required");
        return;
      }
  
      this.http.delete(`${this.apiUrl}/${this.id}`)
        .subscribe((response) => {
          alert('Élément supprimé avec succès');
          // Reset the value after deletion
          this.id = null;
        }, (error) => {
          console.error('Erreur lors de la suppression', error);
        });
    }
  
    showInput: boolean = false;
   
    toggleInput() {
      this.showInput = !this.showInput;
    }
  
    id: number | null = null;
    newMatriculeFautif: string = '';
  
    updateDefaut() {
      const elementToUpdate = this.data.find(item => item.defautid === this.id);
      if (!elementToUpdate) {
        console.error("Element not found");
        return;
      }
  
      const updatedDefaut = {
        ...elementToUpdate,
        matriculefautif: this.newMatriculeFautif
      };
  
      this.http.put(`${this.apiUrl}/${this.id}`, updatedDefaut)
        .subscribe((response) => {
          alert('Élément mis à jour avec succès');
          // Reset values after the update
          this.id = null;
          this.newMatriculeFautif = '';
        }, (error) => {
          console.error('Erreur lors de la mise à jour', error);
        });
    }
}
