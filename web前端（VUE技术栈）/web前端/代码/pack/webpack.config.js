var path = require('path');
module.exports = {
	entry: './src/main.js' ,
	output: {
			//__dirname/.dist/bundle.js
			path: path.resolve(__dirname,'.dist'),
			filename : 'bundle.js'
	},
	module: {
		rules: [
			{
				test: /\.css$/ ,
				use: ['style-loader','css-loader']
			}
		]
		
	}
	
}

