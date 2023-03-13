const path = require("path");

module.exports = {
    mode: "production",
    entry: {
        figure: "./pages/figures/index.js",
        globals: "./pages/globals.js"
    },
    output: {
        filename: "[name]-bundle.js",
        path: path.join(__dirname, "../resources/static/dist"),
        clean: true
    },
    module: {
        rules: [
            {
                test: /\.css$/,
                use: [
                    {loader: "style-loader"},
                    {
                        loader: "css-loader",
                        options: {
                            sourceMap: true
                        }
                    },
                    {
                        loader: "postcss-loader"
                    }
                ]
            }
        ]
    },
    // plugins: [
    // ],
    // devServer: {
    //     open: true,
    //     port: 8081,
    //     compress: true,
    //     liveReload: false,
    //     watchFiles: {
    //         paths: ["../resources/templates/**/*.html", "../resources/static/*"]
    //     },
    //     proxy: {
    //         "/": {
    //             target: "http://127.0.0.1:8080",
    //             changeOrigin: false,
    //             secure: false
    //         },
    //     },
    //     client: {
    //         overlay: true,
    //     },
    //     devMiddleware: {
    //         writeToDisk: true
    //     }
    // }
}