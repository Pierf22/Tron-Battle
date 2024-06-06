package org.application.IA.IA_Dialga.asp_classes;

import it.unical.mat.embasp.languages.Id;
import it.unical.mat.embasp.languages.Param;
import it.unical.mat.embasp.languages.asp.SymbolicConstant;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Id("mossaSceltaDialga")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class MossaSceltaDialga {
    @Param(0)
    private SymbolicConstant direction;
}
