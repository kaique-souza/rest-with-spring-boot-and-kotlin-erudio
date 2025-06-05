package br.com.erudio.operations

import br.com.erudio.exception.UnsupportedMathOperationException
import br.com.erudio.utils.NumberUtils
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import kotlin.math.sqrt

@Suppress("unused")
@RestController
class RaizController {
    val numberUtils: NumberUtils = NumberUtils()

    @RequestMapping(value = ["/raiz/{number}"])
    fun raiz(@PathVariable(value ="number") number: String?
    ) : Double {
        if (!numberUtils.isNumeric(number)) throw UnsupportedMathOperationException("coloque um valor numerico!")
        return  sqrt(numberUtils.convertToDouble(number))
    }
}