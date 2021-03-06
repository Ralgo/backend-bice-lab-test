package cl.bice.lab.indecon.client.rest;

import cl.bice.lab.indecon.dto.IndeconLastValuesDto;
import reactor.core.publisher.Mono;

/**
 * @author Cristian Beroiza <cberoiza AT gmail DOT com> 11-03-21
 */
public interface IndeconRestClient {

    Mono<IndeconLastValuesDto> lastService();

}
