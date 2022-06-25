package Doubts;

public class SpellCheck {

  public static void main(String args[]) {
    String[] elements = {"H", "He", "Li", "Be", "B", "C", "N", "O", "F", "Ne", "Na", "Mg", "Al", "Si", "P", "S", "Cl",
        "Ar", "K", "Ca", "Sc", "Ti", "V", "Cr", "Mn", "Fe", "Co", "Ni", "Cu", "Zn", "Ga", "Ge", "As", "Se", "Br", "Kr",
        "Rb", "Sr", "Y", "Zr", "Nb", "Mo", "Tc", "Ru", "Rh", "Pd", "Ag", "Cd", "In", "Sn", "Sb", "Te", "I", "Xe", "Cs",
        "Ba", "La", "Ce", "Pr", "Nd", "Pm", "Sm", "Eu", "Gd", "Tb", "Dy", "Ho", "Er", "Tm", "Yb", "Lu", "Hf", "Ta", "W",
        "Re", "Os", "Ir", "Pt", "Au", "Hg", "Tl", "Pb", "Bi", "Po", "At", "Rn", "Fr", "Ra", "Ac", "Th", "Pa", "U", "Np",
        "Pu", "Am", "Cm", "Bk", "Cf", "Es", "Fm", "Md", "No", "Lr", "Rf", "Db", "Sg", "Bh", "Hs", "Mt", "Ds", "Rg",
        "Cn", "Uut", "Uuq", "Uup", "Uuh", "Uus", "Uuo"};

    String word = "phone";

    int L = word.length();
    String Input = "",I1="cannot spell the word";


    for (int i = 0; i < L ; i++) {


      for (int a = 0; a < elements.length; a++) {

        if (((i + 3) <= L) && (word.substring(i, i + 3).equalsIgnoreCase(elements[a]))) {
          Input =String.join("",Input,elements[a]);
          i = i + 2;
          break;
        }
        else if (((i + 2) <= L) && (word.substring(i, i + 2).equalsIgnoreCase(elements[a]))) {
          Input =String.join("",Input,elements[a]);
          i = i + 1;
          break;
        }
        else if (((i + 1) <= L) && (word.substring(i, i + 1).equalsIgnoreCase(elements[a]))) {
          Input =String.join("",Input,elements[a]);
          break;
        }
      }
    }
    System.out.print(Input+" ");
  }
}
