package cap10.annotation

import kotlin.annotation.AnnotationRetention.SOURCE
import kotlin.annotation.AnnotationTarget.*

/**
 * Declaração de Anotações
 *
 * Definimos o Target, que são os locais onde elas podem ser usadas
 * Definimos o local de retenção
 *  
    SOURCE (Annotation isn't stored in binary output)
    
    BINARY (Annotation is stored in binary output, but invisible for reflection),
      
    RUNTIME (Annotation is stored in binary output and visible for reflection (default retention))
 */

@Target(CLASS, ANNOTATION_CLASS, PROPERTY, FIELD, LOCAL_VARIABLE, VALUE_PARAMETER,
        CONSTRUCTOR, FUNCTION, PROPERTY_GETTER, PROPERTY_SETTER, TYPE, EXPRESSION, FILE, TYPEALIAS)
@Retention(SOURCE)
public annotation class Name(vararg val names: String)