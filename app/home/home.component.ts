import { HttpClient } from '@angular/common/http';
import { Component } from '@angular/core';

@Component({
selector: 'app-home',
templateUrl: './home.component.html',
styleUrls: ['./home.component.scss']
})
export class HomeComponent {

date: string | undefined;
matriculeeq: string = "";
matriculepo: string = "";
ksk: string = "";
code: string = "";
position: string = "";
case: string = "";
tackt: string = "";
matriculefautif:string ="";


constructor(private http: HttpClient) {this.initializeDate(); }
initializeDate() {
    const currentDate = new Date();
    this.date = currentDate.toISOString().substring(0, 16);
  }

save() {
if ((this.case === "2" && this.position === "wmg2") ||
(this.case === "6" && this.position === "1tlenk6")) {
this.tackt = "Tackt 1.1";
const data = {
date: this.date,
matriculeeq: this.matriculeeq,
matriculepo: this.matriculepo,
ksk: this.ksk,
code: this.code,
position: this.position,
case: this.case,
tackt: this.tackt,
matriculefautif: this.matriculefautif
};
this.http.post("http://localhost:8095/api/v1/defaut/save", data).subscribe((response) => {
console.log(data);
alert("Défaut enregistré avec succès");
});


} else if (this.case === "3" && this.position === "xyz789") {
this.tackt = "Tackt 2.0";
const data = {
date: this.date,
matriculeeq: this.matriculeeq,
matriculepo: this.matriculepo,
ksk: this.ksk,
code: this.code,
position: this.position,
case: this.case,
tackt: this.tackt,
matriculefautif: this.matriculefautif
};
this.http.post("http://localhost:8095/api/v1/defaut/save", data).subscribe((response) => {
console.log(data);
alert("Défaut enregistré avec succès");
});


} else if (this.case === "1" && this.position === "ESPB") {
this.tackt = "Tackt Vorstecken 1";
const data = {
date: this.date,
matriculeeq: this.matriculeeq,
matriculepo: this.matriculepo,
ksk: this.ksk,
code: this.code,
position: this.position,
case: this.case,
tackt: this.tackt,
matriculefautif: this.matriculefautif
};
this.http.post("http://localhost:8095/api/v1/defaut/save", data).subscribe((response) => {
console.log(data);
alert("Défaut enregistré avec succès");
});


} else {
    this.tackt = "Module Montage";
    const data = {
        date: this.date,
        matriculeeq: this.matriculeeq,
        matriculepo: this.matriculepo,
        ksk: this.ksk,
        code: this.code,
        position: this.position,
        case: this.case,
        tackt: this.tackt,
        matriculefautif: this.matriculefautif
        };
        this.http.post("http://localhost:8095/api/v1/defaut/save", data).subscribe((response) => {
        console.log(data);
        alert("Défaut enregistré avec succès");
        });
}
}


  
  
  
  


}
