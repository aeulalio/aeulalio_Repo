module.exports = function(config){
  config.set({
	  
	hostname : 'localhost.bb.com.br',

    basePath : '../../../',

    files : [
             {pattern: 'src/main/webapp/common/libs/vendor/jquery-2.1.1/jquery.js', watched: true, included: true, served: true},
             {pattern: 'src/main/webapp/common/libs/vendor/angular-1.2.18/angular.js', watched: true, included: true, served: true},
             {pattern: 'src/main/webapp/common/libs/vendor/angular-1.2.18/angular-mocks.js', watched: true, included: true, served: true},
             {pattern: 'src/main/webapp/common/libs/vendor/angular-1.2.18/angular-sanitize.js', watched: true, included: true, served: true},
             {pattern: 'src/main/webapp/common/libs/vendor/stacktrace.js-0.6.2/stacktrace.js', watched: true, included: true, served: true},
             
             //{pattern: 'src/main/webapp/plataformabb/2.6/plt-config.js', watched: true, included: true, served: true},
             {pattern: 'src/test/javascript/unit/plataformabb/2.6/plt-config-spec.js', watched: true, included: true, served: true}
             
             //{pattern: 'src/main/webapp/plataformabb/2.6/plt-config.js', watched: true, included: true, served: true},
             //{pattern: 'src/test/javascript/unit/plataformabb/2.6/plt-config-spec.js', watched: true, included: true, served: true}
             
             //{pattern: 'src/main/webapp/common/libs/bb/**/*.js', watched: true, included: true, served: true},
             //{pattern: 'src/test/javascript/unit/common/libs/bb/**/*.js', watched: true, included: true, served: true},
             
             //{pattern: 'src/main/webapp/plataformabb/common/libs/bb/sos-1.0/*.js', watched: true, included: true, served: true},
             //{pattern: 'src/test/javascript/unit/plataformabb/common/libs/bb/sos-1.0/*.js', watched: true, included: true, served: true}
    ],

    autoWatch : true,

    frameworks: ['jasmine'],

    browsers: ['phanthomjs_without_security'],
    
    customLaunchers: {
        phanthomjs_without_security: {
          base: 'PhantomJS',
          flags: ['--ignore-ssl-errors=true',  '--web-security=false']
        }
      },
  
    plugins : [
            'karma-chrome-launcher', 
            'karma-firefox-launcher', 
            'karma-phantomjs-launcher',
            'karma-jasmine',
            'karma-junit-reporter'
            ],

    junitReporter : {
      outputFile: 'test_out/unit.xml',
      suite: 'unit'
    }

  });
};