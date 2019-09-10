package dziemich

import com.amazonaws.services.lambda.runtime.Context
import com.amazonaws.services.lambda.runtime.RequestHandler
import com.amazonaws.services.lambda.runtime.events.APIGatewayProxyRequestEvent
import com.amazonaws.services.lambda.runtime.events.APIGatewayProxyResponseEvent
import org.apache.logging.log4j.LogManager
import org.json.JSONObject

class Handler : RequestHandler<APIGatewayProxyRequestEvent, APIGatewayProxyResponseEvent> {
  companion object {
    private val logger = LogManager.getLogger(Handler::class.java)
  }
  override fun handleRequest(
    input: APIGatewayProxyRequestEvent?,
    context: Context?
  ): APIGatewayProxyResponseEvent {

    logger.info("logger says hello")

    return APIGatewayProxyResponseEvent().apply {
      statusCode = 200
      body = JSONObject().put("message", "Hello").toString()
    }
  }
}
