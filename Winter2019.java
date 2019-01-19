// Codewas- DNA to RNA Conversion
// DNA is composed of four nucleic acid bases Guanine ('G'), Cytosine ('C'), Adenine ('A'), and Thymine ('T').
// RNA's chemical structure and contains no Thymine. In RNA Thymine is replaced by another nucleic acid Uracil ('U').
// Create a function which translates a given DNA string into RNA.

public String dnaToRna(String dna) {
      String replaceString = dna.replace('T','U');
        return replaceString; 
    } 
