package ai.boost

import org.grails.datastore.mapping.core.connections.ConnectionSource

class Intent {

    String title

    static constraints = {
        title nullable: false
    }

    static mapping = {
        version false
        datasources([ConnectionSource.DEFAULT, 'qa'])
    }
}
