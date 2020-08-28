const { Core } = require('@adobe/aio-sdk');
require("regenerator-runtime/runtime");
const processor = require('../common/app');
const LOG = Core.Logger('main', { level: 'debug'});

async function main(args) {
  let response = '';
  try {
    response = await processor.processSPA(args);
    LOG.info("Successfully returned SSR call");
  } catch (err) {
    LOG.error("Error: " + err);
    return response;
  }
  LOG.debug(response);
  return {
     headers: {
       'Content-Type': 'text/html'
     },
     statusCode: 200,
     body: response
   }
}

exports.main = main;
