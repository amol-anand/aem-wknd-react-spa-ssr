import { MapTo } from '@adobe/cq-react-editable-components';
import TTAC from './index.source';

/**
 * Example of important a shared component
 */
require('./Ttac.css');

const TtacEditConfig = {
  emptyLabel: '[Text, Title, and CTA Component]',

  isEmpty: function (props) {
    return !props || !props.title;
  },
};

export default MapTo('wknd-spa-react/components/ttac')(TTAC, TtacEditConfig);
