/** @type {import('tailwindcss').Config} */
const plugin = require('tailwindcss/plugin');

module.exports = {
    content: ['../resources/templates/**/*.{html,js,ts,jsx,tsx}'],
    darkMode: 'class',
    theme: {
        extend: {
            backgroundPosition: {
                'center-top': 'center top',
                '100%-auto': '100% auto',
                'auto-100%': 'auto 100%',
                '50%': '50%',
            }
        },
    },
    plugins: [
        plugin(function ({addComponents, theme}) {
            addComponents({
                '.card': {
                    '@apply flex justify-items-stretch items-stretch drop-shadow-lg rounded-md': '',
                    border: `1px solid ${theme('colors.gray.100')}`,
                    borderRadius: theme('borderRadius.sm'),
                }
            })
        })
    ],
}
