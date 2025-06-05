package br.com.erudio.operations

import br.com.erudio.exception.UnsupportedMathOperationException
import br.com.erudio.utils.NumberUtils
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@Suppress("unused")
@RestController
class DivController {
    val numberUtils: NumberUtils = NumberUtils()

    @RequestMapping(value = ["/div/{numberOne}/{numberTwo}"])
    fun div(@PathVariable(value ="numberOne") numberOne: String?,
            @PathVariable(value ="numberTwo") numberTwo: String?
    ) : Double {
        if (!numberUtils.isNumeric(numberOne) || !numberUtils.isNumeric(numberTwo)) throw UnsupportedMathOperationException("coloque um valor numerico!")
        return numberUtils.convertToDouble(numberOne) / numberUtils.convertToDouble(numberTwo)
    }
}