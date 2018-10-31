package ai.boost

import grails.gorm.transactions.Transactional

@Transactional(connection = 'qa')
class IntentService {

    def readIntent() {
        Intent intent = Intent.get(1)
        println intent.title
    }
}