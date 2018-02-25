module.exports = function(config){
  config.set({
	  
	//hostname : 'localhost.bb.com.br',

    basePath : '../../../',

    files : [
             {pattern: 'src/main/webapp/scripts/vendor/angular-1.3.15/angular.js', included: true, served: true},
             {pattern: 'src/main/webapp/scripts/vendor/angular-1.3.15/angular-mocks.js', included: true, served: true},
             {pattern: 'src/main/webapp/scripts/vendor/angular-1.3.15/angular-sanitize.js', included: true, served: true},

             {pattern: 'src/test/javascript/unit/teste-exemplo-spec.js', included: true, served: true}
    ],

    autoWatch : false,
    
	// Only run once in CI mode
	singleRun : true,

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
    	outputFile: 'karma-reports/test-results.xml',
    	suite: 'unit'
    }

  });
};