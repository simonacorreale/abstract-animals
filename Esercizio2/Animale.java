package Esercizio1.src;
/* Esercizio 2 : interfacce Alcuni degli animali che abbiamo creato volano, altri nuotano.
Esercizio 2 : interfacce Alcuni degli animali che abbiamo creato volano, altri nuotano.
Gli animali che volano hanno il seguente metodo :
void vola() (mostra a video “Sto volando!!!”)
Gli animali che nuotano hanno il seguente metodo :
void nuota() (mostra a video “Sto nuotando!!!”)
Scrivere un programma avente 2 metodi :
void faiVolare(IVolante animale)
void faiNuotare(INuotante animale)
Questi metodi prendono come parametro un animale che può o volare / nuotare e richiamano il corrispondente metodo vola() / nuota().
Scrivere un programma che istanzi animali che volano o nuotano e richiamare i metodi faiVolare / faiNuotare passandoglieli come parametro.
Buon lavoro! :)
 */

interface  Animale {

    interface Animal {
        public void animalSound(); 
        public void run(); // interface method (does not have a body)
      }

}
